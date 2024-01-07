--drop table album, card, word, t_user;

CREATE TYPE IF NOT EXISTS part_of_speech AS enum (
	'noun',			-- Существительное (child, Cebu, Japan, mall, love)
	'verb',			-- Глагол (eat, is, talk, sleep)
	'adjective',	-- Прилагательное (large, blue, old, many, high)
	'adverb',		-- Наречие (happily, often, silently, well)
	'numerals',		-- Числительные (Fifty, eighty, thirty-first)
	'pronoun',		-- Местоимение (he, we, they, it, myself, himself)
	'preposition',	-- Предлог (on, at, top, beside, in)
	'conjunction',	-- Союз (and, but, because, for, so)
	'interjection',	-- Междометие (Ouchh!… oh!… Oops!…Wow!)
	'articles',		-- Артикль (The, a/an)
	'particles'		-- Частицы (Not, yet, else)
);

CREATE TABLE IF NOT EXISTS t_user(
	id bigserial PRIMARY KEY,
	username varchar(100) NOT NULL unique,	-- Имя альбома e.g."admin"
	password varchar(100) NOT NULL			-- Пароль
);
-- insert into t_user(username, password) values ('user', 'user');


CREATE TABLE IF NOT EXISTS album(
	ID bigserial PRIMARY KEY,
	name varchar(100) NOT NULL,				-- Имя альбома e.g."common english"
	username bigserial REFERENCES t_user,	-- Владелец
	description text						-- Описание
);
-- insert into album(name) values ('common english');


CREATE TABLE IF NOT EXISTS word(
	word varchar(100) PRIMARY KEY,	-- Слово e.g. "habit"
	full_form varchar(100),			-- Полная форма "a word"
	pronunciation varchar(100),		-- Транскрипция "ˈhæbɪt"
	part_of_speech part_of_speech 	-- Часть речи e.g. "noun"
);
-- insert into word values ('habit', 'a habit', 'ˈhæbɪt', 'noun');


CREATE TABLE IF NOT EXISTS card(
	ID bigserial PRIMARY KEY,
	album_id bigserial REFERENCES album,	-- Альбом ID
	word varchar(100) REFERENCES word,		-- Слово
	value varchar(100),						-- Перевод e.g. "привычка"
	definition text,            		 	-- Описание e.g. "something that you do regularly, almost without thinking about it"
	example text,						 	-- Пример употребления e.g. "He's just eating out of habit - he's not really hungry."
	created timestamp DEFAULT now()		 	-- Дата добавления
);
-- insert into card(album_id, word, value, definition, example) values (
-- 	1,
-- 	'habit',
-- 	'привычка',
-- 	'something that you do regularly, almost without thinking about it',
-- 	'He''s just eating out of habit - he''s not really hungry.'
-- );

