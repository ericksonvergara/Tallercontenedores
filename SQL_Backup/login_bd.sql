PGDMP     )    (        	        z            login_bd    14.1    14.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24759    login_bd    DATABASE     d   CREATE DATABASE login_bd WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE login_bd;
                postgres    false            ?            1259    32768    area    TABLE     h   CREATE TABLE public.area (
    codigo_area integer NOT NULL,
    especialidad_area character varying
);
    DROP TABLE public.area;
       public         heap    postgres    false            ?            1259    32775    doctor    TABLE     ?   CREATE TABLE public.doctor (
    cedula_doctor numeric NOT NULL,
    nombre_doctor character varying,
    telefono_doctor numeric,
    tipo_doctor character varying,
    especialidad_doctor integer
);
    DROP TABLE public.doctor;
       public         heap    postgres    false            ?            1259    32789    ingreso    TABLE     |   CREATE TABLE public.ingreso (
    cedula_paciente integer,
    nombre_paciente character varying,
    fecha_ingreso date
);
    DROP TABLE public.ingreso;
       public         heap    postgres    false            ?            1259    32782    paciente    TABLE     ?   CREATE TABLE public.paciente (
    cedula_paciente integer NOT NULL,
    nombre_paciente character varying,
    edad_paciente integer,
    telefono_paciente integer
);
    DROP TABLE public.paciente;
       public         heap    postgres    false            ?            1259    32794    salida    TABLE     ?   CREATE TABLE public.salida (
    cedula_paciente integer,
    nombre_paciente character varying,
    fecha_ingreso date,
    fecha_salida date,
    nombre_doctor character varying,
    estado_paciente character varying,
    valor_pagar integer
);
    DROP TABLE public.salida;
       public         heap    postgres    false            ?            1259    24767    usuario    TABLE     ?   CREATE TABLE public.usuario (
    nombre character varying,
    documento character varying,
    correo character varying,
    telefono character varying,
    "contraseña" character varying
);
    DROP TABLE public.usuario;
       public         heap    postgres    false                      0    32768    area 
   TABLE DATA           >   COPY public.area (codigo_area, especialidad_area) FROM stdin;
    public          postgres    false    210   ?                 0    32775    doctor 
   TABLE DATA           q   COPY public.doctor (cedula_doctor, nombre_doctor, telefono_doctor, tipo_doctor, especialidad_doctor) FROM stdin;
    public          postgres    false    211                    0    32789    ingreso 
   TABLE DATA           R   COPY public.ingreso (cedula_paciente, nombre_paciente, fecha_ingreso) FROM stdin;
    public          postgres    false    213   _                 0    32782    paciente 
   TABLE DATA           f   COPY public.paciente (cedula_paciente, nombre_paciente, edad_paciente, telefono_paciente) FROM stdin;
    public          postgres    false    212   |                 0    32794    salida 
   TABLE DATA           ?   COPY public.salida (cedula_paciente, nombre_paciente, fecha_ingreso, fecha_salida, nombre_doctor, estado_paciente, valor_pagar) FROM stdin;
    public          postgres    false    214   ?                 0    24767    usuario 
   TABLE DATA           U   COPY public.usuario (nombre, documento, correo, telefono, "contraseña") FROM stdin;
    public          postgres    false    209   ?       p           2606    32774    area area_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.area
    ADD CONSTRAINT area_pkey PRIMARY KEY (codigo_area);
 8   ALTER TABLE ONLY public.area DROP CONSTRAINT area_pkey;
       public            postgres    false    210            r           2606    32868    doctor doctor_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.doctor
    ADD CONSTRAINT doctor_pkey PRIMARY KEY (cedula_doctor);
 <   ALTER TABLE ONLY public.doctor DROP CONSTRAINT doctor_pkey;
       public            postgres    false    211            t           2606    32788    paciente paciente_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.paciente
    ADD CONSTRAINT paciente_pkey PRIMARY KEY (cedula_paciente);
 @   ALTER TABLE ONLY public.paciente DROP CONSTRAINT paciente_pkey;
       public            postgres    false    212            w           2606    32809    salida cedula_paciente    FK CONSTRAINT     ?   ALTER TABLE ONLY public.salida
    ADD CONSTRAINT cedula_paciente FOREIGN KEY (cedula_paciente) REFERENCES public.paciente(cedula_paciente) NOT VALID;
 @   ALTER TABLE ONLY public.salida DROP CONSTRAINT cedula_paciente;
       public          postgres    false    214    3188    212            u           2606    32819    doctor especialidad_doctor    FK CONSTRAINT     ?   ALTER TABLE ONLY public.doctor
    ADD CONSTRAINT especialidad_doctor FOREIGN KEY (especialidad_doctor) REFERENCES public.area(codigo_area) NOT VALID;
 D   ALTER TABLE ONLY public.doctor DROP CONSTRAINT especialidad_doctor;
       public          postgres    false    3184    210    211            v           2606    32804    ingreso ingreso_paciente_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.ingreso
    ADD CONSTRAINT ingreso_paciente_fkey FOREIGN KEY (cedula_paciente) REFERENCES public.paciente(cedula_paciente) NOT VALID;
 G   ALTER TABLE ONLY public.ingreso DROP CONSTRAINT ingreso_paciente_fkey;
       public          postgres    false    212    3188    213               V  x?U?KN?0???S?(N?\???
?d3u?e?c۩?P???1i??]X??ϯy??L???Q@?
?wE???U)¾?,0TG??E5????	???	,c?5?3O?C????²c?j+?)xr???:???ԅu.????)?ᑆ??l,????\xt?f(?)6hX???!P?????H?ɠ??f??????u???????Q:C?܊;Iz]y| %?|?X&u????VN4=hM???E?R%?m??i???KQ?ΐn?ӫ??5??E#???i??%6?u+k?q
/??Nݥmv??cK??Cs؈?t?2?M䯶G?R?r???7?ͦ??[
?3??)??Y??1         0  x?m??N#9?????ؕ??	?4??foLbh/M9	(??{?????#Eݩ??S?);??b??C??2\L%???Hk?J??m???2Ϲ?I(??@??ټ?s9????ϲ?g,)Oڈ?voyS?Tv?$HZE?{?%nr??4?H?V6c>j?;mO?Xz?Yv?ķ1m?%?5?i'?W?zMF??h?>L?jq??~L?M???ڄ??!K??H?)???!??y,M?Y?h?;????m?d9q?Ұ:?O?m??.?!?W????Y|?-=?iJ?yKxgF?b??U>?&s?+2?H?u??c??FT?N?=}??7?9?-?X???<?=?4????$???b??/Fkh??vW?y_?g?w?hi޼???>pp?z???+?oI?zsh?(?E?(_w5F	J?5T[6i JA+c??J?/?Ƌ
ݏyt?۴[?E0Yg?i?(?X?????n??}?r?<????????O???????1FDE?Os?d?BAwx???q???y+?????"	?tF??X??57?4幂>p?(?|G1??䘵3?ϲ?ԩ??H@j??Ѫ??(??F??ٔ?????{hB[?Vxd??ѻ?^Y??6?}n??1??2O?j??{%???-????e?}Զ??_jd??eA?g ??:\?2?>]E?HE\D????bk?P??ZɻE???¶?DA?qqX??.?S?3T?ƃ1?⢴?q0???g????Ga62??K?J??>!?sb?*?@?<:?x$M]7L???]?F?&t?R??(4-˓Yu?`?? ??;/y????7??`??%\?́?????$?b?,?b֨}?R?H???@?S???izO[,V??Em'[	?,?2???w4?##?sz??=?Q??up6???1??^6?W??}k????>?!c??el?u????Ey??Q?????bg??UI?s1?#? ??*?B???q?p?\?#?????mAm???8h%=?1?h?^??<ܷ???2?O?4Ig?q??3?~??iWf?p?!x?k???X???`*q???p?? Z?????%???R?? h?;?            x?????? ? ?            x?????? ? ?            x?????? ? ?            x?????? ? ?     