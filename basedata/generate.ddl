create schema public
;

comment on schema public is 'standard public schema'
;

create table kruszce
(
	id integer not null
		constraint kruszec_id_pk
			primary key,
	typ varchar(255) not null,
	cena double precision not null
)
;

create table kraje
(
	id serial not null
		constraint kraj_pkey
			primary key,
	nazwa varchar(255) not null
)
;

create table panujacy
(
	id serial not null
		constraint panujacy_pkey
			primary key,
	nazwa varchar(255) not null,
	kraj_id integer not null
		constraint panujacy_kraje__id_fk
			references kraje,
	lata integer
)
;

create unique index panujacy_nazwa_uindex
	on panujacy (nazwa)
;

create table mennice
(
	id serial not null
		constraint mennice_pkey
			primary key,
	nazwa varchar(255) not null,
	kraj_id integer not null
		constraint mennice_kraje_id_fk
			references kraje,
	opis varchar(255)
)
;

create index mennice_nazwa_index
	on mennice (nazwa)
;

create table firmy_certyfikujace
(
	id serial not null
		constraint firma_certyfikujaca_pkey
			primary key,
	nazwa varchar(255) not null
)
;

create table stan
(
	id serial not null
		constraint stan_pkey
			primary key,
	typ varchar(255) not null
)
;

create table monety
(
	id varchar(255) not null
		constraint monety_pkey
			primary key,
	nazwa varchar(255) not null,
	waga double precision not null,
	proba integer not null,
	cena double precision not null,
	kruszec_id integer not null
		constraint monety_kruszec_id_fk
			references kruszce,
	stan_id integer
		constraint monety_stan_id_fk
			references stan,
	rok integer,
	opis varchar(255)
)
;

create table certyfikaty
(
	moneta_id varchar(255) not null
		constraint certyfikaty_pkey
			primary key
		constraint certyfikaty_monety_id_fk
			references monety,
	nazwa varchar(255) not null,
	gradying varchar(255) not null,
	firma_id integer not null
		constraint certyfikaty_firma_certyfikujaca_id_fk
			references firmy_certyfikujace,
	data_wystawienia date
)
;

create unique index stan_typ_uindex
	on stan (typ)
;

