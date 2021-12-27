CREATE TABLE "club"
(
    "id"         uuid PRIMARY KEY,
    "name"       text,
    "created_at" date
);

CREATE TABLE "address"
(
    "id"         uuid PRIMARY KEY,
    "club_id"    uuid,
    "name"       text,
    "address"    text,
    "created_at" date
);

CREATE TABLE "event"
(
    "id"         uuid PRIMARY KEY,
    "club_id"    uuid,
    "name"       text,
    "event_date" date,
    "created_at" date
);

CREATE TABLE "event_comedian"
(
    "id"          uuid PRIMARY KEY,
    "comedian_id" uuid,
    "event_id"    uuid
);

CREATE TABLE "comedian"
(
    "id"         uuid PRIMARY KEY,
    "name"       text,
    "club_id"    uuid,
    "created_at" date
);

ALTER TABLE "address"
    ADD FOREIGN KEY ("id") REFERENCES "club" ("id");

ALTER TABLE "comedian"
    ADD FOREIGN KEY ("club_id") REFERENCES "club" ("id");

ALTER TABLE "event"
    ADD FOREIGN KEY ("club_id") REFERENCES "club" ("id");

ALTER TABLE "event_comedian"
    ADD FOREIGN KEY ("comedian_id") REFERENCES "comedian" ("id");

ALTER TABLE "event_comedian"
    ADD FOREIGN KEY ("event_id") REFERENCES "event" ("id");
