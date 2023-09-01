CREATE KEYSPACE IF NOT EXISTS docsmoxkeyspace
    WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE docsmoxkeyspace;

CREATE TABLE IF NOT EXISTS notes (
                                        id UUID PRIMARY KEY,
                                        name TEXT,
                                        userId UUID,
                                        title TEXT,
                                        wordcount float,
                                        content TEXT,
                                        timestamp DATE
);

CREATE TABLE IF NOT EXISTS spaces(
                                        id UUID PRIMARY KEY,
                                        notesId UUID,
                                        userId UUID,
                                        subspacesId UUID,
                                        teamsId UUID,
                                        name TEXT,
                                        description TEXT,
                                        notescount float
);
CREATE TABLE IF NOT EXISTS subspaces(
                                        id UUID PRIMARY KEY,
                                        notesId UUID,
                                        userId UUID,
                                        spacesId UUID,
                                        teamsId UUID,
                                        name TEXT,
                                        description TEXT,
                                        notescount float
);
CREATE TABLE IF NOT EXISTS teams(
                                        id UUID PRIMARY KEY,
                                        notesId UUID,
                                        userId UUID,
                                        spacesId UUID,
                                        subspacesId UUID,
                                        name TEXT,
                                        description TEXT,
                                        usercount float
);
CREATE TABLE IF NOT EXISTS user(
                                    id UUID PRIMARY KEY,
                                    name TEXT,
                                    firstname TEXT,
                                    phonenumber TEXT,
                                    email TEXT,
                                    usercount float,
                                    teamsId UUID,
                                    friendsId UUID
);
