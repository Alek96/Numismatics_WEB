create schema public
;

comment on schema public is 'standard public schema'
;

create table kruszce
(
	id integer not null
		constraint kruszec_id_pk
			primary key,
	typ text not null,
	cena double precision not null
)
;

create table mennice
(
	id serial not null
		constraint mennice_pkey
			primary key,
	nazwa text not null,
	opis text
)
;

create index mennice_nazwa_index
	on mennice (nazwa)
;

create table typy_stanow
(
	id serial not null
		constraint typy_stanow_pkey
			primary key,
	nazwa text not null
)
;

create table firmy_certyfikujace
(
	id serial not null
		constraint firma_certyfikujaca_pkey
			primary key,
	nazwa text not null,
	skrot text not null,
	typ_stanu_id integer
		constraint firmy_certyfikujace_typy_stanow_id_fk
			references typy_stanow,
	typ_lustrzanki_id integer
		constraint firmy_certyfikujace_typy_lustrzanek_id_fk_2
			references typy_stanow
)
;

create table stany
(
	id serial not null
		constraint stan_pkey
			primary key,
	nazwa text not null,
	typ_id integer not null
		constraint stany_typy_stanow_id_fk
			references typy_stanow
)
;

create unique index typy_stanow_nazwa_uindex
	on typy_stanow (nazwa)
;

create table typy_krajow
(
	id serial not null
		constraint typy_krajow_pkey
			primary key,
	nazwa text not null
)
;

create table kraje
(
	id serial not null
		constraint kraj_pkey
			primary key,
	nazwa text not null,
	typ_id integer not null
		constraint kraje_typy_krajow_id_fk
			references typy_krajow
)
;

create table panujacy
(
	id serial not null
		constraint panujacy_pkey
			primary key,
	nazwa text not null,
	kraj_id integer not null
		constraint panujacy_kraje__id_fk
			references kraje,
	lata integer
)
;

create unique index panujacy_nazwa_uindex
	on panujacy (nazwa)
;

create table monety
(
	id text not null
		constraint monety_pkey
			primary key,
	nazwa text not null,
	waga double precision not null,
	proba integer not null,
	cena double precision not null,
	kruszec_id integer not null
		constraint monety_kruszec_id_fk
			references kruszce,
	stan_id integer
		constraint monety_stan_id_fk
			references stany,
	kraj_id integer not null
		constraint monety_kraje_id_fk
			references kraje,
	panujacy_id integer
		constraint monety_panujacy_id_fk
			references panujacy,
	mennica_id integer
		constraint monety_mennice_id_fk
			references mennice,
	rok integer,
	opis text,
	literatura text
)
;

create table certyfikaty
(
	moneta_id text not null
		constraint certyfikaty_pkey
			primary key
		constraint certyfikaty_monety_id_fk
			references monety,
	nazwa text not null,
	gradying text not null,
	firma_id integer not null
		constraint certyfikaty_firma_certyfikujaca_id_fk
			references firmy_certyfikujace,
	data_wystawienia date
)
;

create unique index typy_krajow_nazwa_uindex
	on typy_krajow (nazwa)
;

create table zdjecia
(
	id serial not null
		constraint zdjecia_pkey
			primary key,
	moneta_id text not null
		constraint zdjecia_monety_id_fk
			references monety,
	zdjecie bytea not null
)
;

