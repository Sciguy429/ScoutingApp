package scouting.sciguy429.com.scoutingapp.Objects;

public class DBBAK {
    public String sql = ";             \n" +
            "CREATE USER IF NOT EXISTS JAVAADMIN SALT '60910cc8c1e3edc8' HASH '223fd9678b9436d6ca54c0e6908959c8e1f29e6ed2c6864864a46397b0f71f90' ADMIN;    \n" +
            "CREATE USER IF NOT EXISTS SA SALT '9e52b2e038d4dfa7' HASH 'ad5ab7703ca3c6f056ea056d1601d56db128cb4647f9318695c71a422882c390' ADMIN;           \n" +
            "CREATE CACHED TABLE PUBLIC.MATCHES(\n" +
            "    MATCH_NUMBER INTEGER NOT NULL,\n" +
            "    MATCH_R1_NUMBER INTEGER,\n" +
            "    MATCH_R1_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R1_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R1_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R1_CLIMB BOOLEAN,\n" +
            "    MATCH_R1_FELL BOOLEAN,\n" +
            "    MATCH_R1_FOULS INTEGER,\n" +
            "    MATCH_R1_CARDS INTEGER,\n" +
            "    MATCH_R1_COMMENT VARCHAR(512),\n" +
            "    MATCH_R2_NUMBER INTEGER,\n" +
            "    MATCH_R2_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R2_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R2_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R2_CLIMB BOOLEAN,\n" +
            "    MATCH_R2_FELL BOOLEAN,\n" +
            "    MATCH_R2_FOULS INTEGER,\n" +
            "    MATCH_R2_CARDS INTEGER,\n" +
            "    MATCH_R2_COMMENT VARCHAR(512),\n" +
            "    MATCH_R3_NUMBER INTEGER,\n" +
            "    MATCH_R3_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_R3_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_R3_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_R3_CLIMB BOOLEAN,\n" +
            "    MATCH_R3_FELL BOOLEAN,\n" +
            "    MATCH_R3_FOULS INTEGER,\n" +
            "    MATCH_R3_CARDS INTEGER,\n" +
            "    MATCH_R3_COMMENT VARCHAR(512),\n" +
            "    MATCH_B1_NUMBER INTEGER,\n" +
            "    MATCH_B1_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B1_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B1_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B1_CLIMB BOOLEAN,\n" +
            "    MATCH_B1_FELL BOOLEAN,\n" +
            "    MATCH_B1_FOULS INTEGER,\n" +
            "    MATCH_B1_CARDS INTEGER,\n" +
            "    MATCH_B1_COMMENT VARCHAR(512),\n" +
            "    MATCH_B2_NUMBER INTEGER,\n" +
            "    MATCH_B2_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B2_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B2_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B2_CLIMB BOOLEAN,\n" +
            "    MATCH_B2_FELL BOOLEAN,\n" +
            "    MATCH_B2_FOULS INTEGER,\n" +
            "    MATCH_B2_CARDS INTEGER,\n" +
            "    MATCH_B2_COMMENT VARCHAR(512),\n" +
            "    MATCH_B3_NUMBER INTEGER,\n" +
            "    MATCH_B3_CUBES_ON_SCALE INTEGER,\n" +
            "    MATCH_B3_CUBES_ON_SWITCH INTEGER,\n" +
            "    MATCH_B3_CUBES_IN_PORTAL INTEGER,\n" +
            "    MATCH_B3_CLIMB BOOLEAN,\n" +
            "    MATCH_B3_FELL BOOLEAN,\n" +
            "    MATCH_B3_FOULS INTEGER,\n" +
            "    MATCH_B3_CARDS INTEGER,\n" +
            "    MATCH_B3_COMMENT VARCHAR(512)\n" +
            ");              \n" +
            "ALTER TABLE PUBLIC.MATCHES ADD CONSTRAINT PUBLIC.CONSTRAINT_5 PRIMARY KEY(MATCH_NUMBER);      \n" +
            "-- 5 +/- SELECT COUNT(*) FROM PUBLIC.MATCHES; \n" +
            "INSERT INTO PUBLIC.MATCHES(MATCH_NUMBER, MATCH_R1_NUMBER, MATCH_R1_CUBES_ON_SCALE, MATCH_R1_CUBES_ON_SWITCH, MATCH_R1_CUBES_IN_PORTAL, MATCH_R1_CLIMB, MATCH_R1_FELL, MATCH_R1_FOULS, MATCH_R1_CARDS, MATCH_R1_COMMENT, MATCH_R2_NUMBER, MATCH_R2_CUBES_ON_SCALE, MATCH_R2_CUBES_ON_SWITCH, MATCH_R2_CUBES_IN_PORTAL, MATCH_R2_CLIMB, MATCH_R2_FELL, MATCH_R2_FOULS, MATCH_R2_CARDS, MATCH_R2_COMMENT, MATCH_R3_NUMBER, MATCH_R3_CUBES_ON_SCALE, MATCH_R3_CUBES_ON_SWITCH, MATCH_R3_CUBES_IN_PORTAL, MATCH_R3_CLIMB, MATCH_R3_FELL, MATCH_R3_FOULS, MATCH_R3_CARDS, MATCH_R3_COMMENT, MATCH_B1_NUMBER, MATCH_B1_CUBES_ON_SCALE, MATCH_B1_CUBES_ON_SWITCH, MATCH_B1_CUBES_IN_PORTAL, MATCH_B1_CLIMB, MATCH_B1_FELL, MATCH_B1_FOULS, MATCH_B1_CARDS, MATCH_B1_COMMENT, MATCH_B2_NUMBER, MATCH_B2_CUBES_ON_SCALE, MATCH_B2_CUBES_ON_SWITCH, MATCH_B2_CUBES_IN_PORTAL, MATCH_B2_CLIMB, MATCH_B2_FELL, MATCH_B2_FOULS, MATCH_B2_CARDS, MATCH_B2_COMMENT, MATCH_B3_NUMBER, MATCH_B3_CUBES_ON_SCALE, MATCH_B3_CUBES_ON_SWITCH, MATCH_B3_CUBES_IN_PORTAL, MATCH_B3_CLIMB, MATCH_B3_FELL, MATCH_B3_FOULS, MATCH_B3_CARDS, MATCH_B3_COMMENT) VALUES\n" +
            "(1, 1285, 1, 0, 0, TRUE, TRUE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0'),\n" +
            "(2, 6578, 1, 0, 1, TRUE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '1'),\n" +
            "(3, 4582, 0, 0, 1, TRUE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '1'),\n" +
            "(4, 1356, 0, 0, 522, TRUE, TRUE, 1, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0'),\n" +
            "(5, 4689, 0, 0, 25, TRUE, TRUE, 1, 1, '1', 1, 1, 1, 1, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0', 0, 0, 0, 0, FALSE, FALSE, 0, 0, '0');       \n" +
            "CREATE CACHED TABLE PUBLIC.TEAMS(\n" +
            "    TEAM_NUMBER INT NOT NULL,\n" +
            "    TEAM_NAME VARCHAR(512) NOT NULL,\n" +
            "    TEAM_DATA_DRIVE_TRAIN VARCHAR(512),\n" +
            "    TEAM_DATA_PICTURE_SERVER_URI VARCHAR(512),\n" +
            "    TEAM_DATA_PICTURE_CLIENT_URI VARCHAR(512),\n" +
            "    TEAM_DATA_HEIGHT FLOAT,\n" +
            "    TEAM_DATA_PLACE_ON_SCALE BOOLEAN,\n" +
            "    TEAM_DATA_PLACE_ON_SWITCH BOOLEAN,\n" +
            "    TEAM_DATA_CAN_CLIMB BOOLEAN,\n" +
            "    TEAM_DATA_PLACE_IN_PORTAL BOOLEAN,\n" +
            "    TEAM_DATA_PICKUP_IN_ANY_ORIENTATION BOOLEAN,\n" +
            "    TEAM_DATA_CUBE_PLACE_METHOD VARCHAR(512),\n" +
            "    TEAM_DATA_COMMENTS VARCHAR(512)\n" +
            ");               \n" +
            "ALTER TABLE PUBLIC.TEAMS ADD CONSTRAINT PUBLIC.CONSTRAINT_4C PRIMARY KEY(TEAM_NUMBER);        \n" +
            "-- 49 +/- SELECT COUNT(*) FROM PUBLIC.TEAMS;  \n" +
            "INSERT INTO PUBLIC.TEAMS(TEAM_NUMBER, TEAM_NAME, TEAM_DATA_DRIVE_TRAIN, TEAM_DATA_PICTURE_SERVER_URI, TEAM_DATA_PICTURE_CLIENT_URI, TEAM_DATA_HEIGHT, TEAM_DATA_PLACE_ON_SCALE, TEAM_DATA_PLACE_ON_SWITCH, TEAM_DATA_CAN_CLIMB, TEAM_DATA_PLACE_IN_PORTAL, TEAM_DATA_PICKUP_IN_ANY_ORIENTATION, TEAM_DATA_CUBE_PLACE_METHOD, TEAM_DATA_COMMENTS) VALUES\n" +
            "(931, 'Perpetual Chaos', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1094, 'Channel Cats', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1178, 'DuRT (De Smet ultimate Robotics Team)', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1208, 'Metool Brigade', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1288, 'RAVEN Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, STRINGDECODE('( \\u0361\\u00b0 \\u035c\\u0296 \\u0361\\u00b0)')),\n" +
            "(1329, 'ROBOREBELS', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1444, 'Lightning 1444', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1625, 'Winnovation', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1658, 'Tech Heads', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1706, 'Ratchet Rockers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1732, 'Hilltoppers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(1985, 'Robohawks', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2022, 'Titan Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2081, 'Icarus', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2408, 'Shrapnel Sergeants', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2451, 'PWNAGE', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2481, 'Roboteers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2707, 'Team PCD', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2783, 'Engineers of Tomorrow', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(2978, 'Cavaliers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3197, 'HexHounds', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3284, 'Camdenton LASER', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3330, 'System of the Corn', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3397, 'Robolions', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3692, 'Rock N'' Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3792, 'The Army Ants', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(3814, 'PiBotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4143, 'MARS/ WARS', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4187, 'RoboRams', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4232, 'AHS Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4246, 'Resurrected Robotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4256, 'Cyborg Cats', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4329, 'Lutheran Roboteers', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4330, 'Rambunction', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4356, 'CIA Robotics Presents - BIG Furious George', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4500, 'RoboHounds', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4600, 'Tech Titans', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(4931, 'Edwardsville Technologies', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5060, 'KnighTech', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5147, 'Hornets', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5176, 'RoboBills', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL); \n" +
            "INSERT INTO PUBLIC.TEAMS(TEAM_NUMBER, TEAM_NAME, TEAM_DATA_DRIVE_TRAIN, TEAM_DATA_PICTURE_SERVER_URI, TEAM_DATA_PICTURE_CLIENT_URI, TEAM_DATA_HEIGHT, TEAM_DATA_PLACE_ON_SCALE, TEAM_DATA_PLACE_ON_SWITCH, TEAM_DATA_CAN_CLIMB, TEAM_DATA_PLACE_IN_PORTAL, TEAM_DATA_PICKUP_IN_ANY_ORIENTATION, TEAM_DATA_CUBE_PLACE_METHOD, TEAM_DATA_COMMENTS) VALUES\n" +
            "(5326, 'Optimus PRIN', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5583, 'SistamatiK', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(5836, 'Mechanic Mutts', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6391, 'Ursuline Bearbotics', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6660, 'MarkerBots', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(6744, 'Mehville Pi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(7117, 'Robotic Dragons', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),\n" +
            "(7255, 'Mechanical Mettle', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);   \n";
    DBBAK () {}
}
