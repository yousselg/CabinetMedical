-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 18 Novembre 2017 à 13:48
-- Version du serveur :  5.6.21
-- Version de PHP :  5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cabinetmed`
--

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
`id_examen` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `consultation_id_consultation` bigint(20) DEFAULT NULL,
  `type_examen_id_type_examen` bigint(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `examen`
--

INSERT INTO `examen` (`id_examen`, `description`, `consultation_id_consultation`, `type_examen_id_type_examen`) VALUES
(1, 'bccf0003-51bc-45f5-81f6-b9a8a53dbb24', 1, NULL),
(2, 'a3c28109-5c2c-4320-bc51-70781c7bce47', 2, NULL),
(3, 'af11db3a-743e-4b78-9c11-1da243458b5a', 6, NULL),
(4, 'a3d2868e-40d1-4294-8aa1-eabad488c769', 8, NULL),
(5, '4f022d0a-1faa-46d3-aeb2-09142411ab77', 10, NULL),
(6, 'a2ead3ca-67ac-4ea2-9e4b-d147fcbddcf9', 13, NULL),
(7, '9d4336c7-62d6-46d8-b32b-b169aa98c647', 14, NULL),
(8, 'b3530494-05e2-447f-821a-47f5599ebf1a', 15, NULL),
(9, 'abee843d-4c45-4347-85be-c0df8fb66ee5', 20, NULL),
(10, '9f326123-e724-473e-95a7-3c0223c1c098', 21, NULL),
(11, '040359c9-b842-48f0-b438-33c32f30cdad', 23, NULL),
(12, '92967236-376c-446d-b05d-26246970bdc5', 25, NULL),
(13, '0cecee45-bd1b-48d4-aafc-65fc33e0f490', 27, NULL),
(14, 'bf3673a5-8be5-4606-862e-388739d7b622', 28, NULL),
(15, '1d8edee4-98a8-4d40-9a7e-e7d2611ff192', 31, NULL),
(16, '932dea62-96be-4cc5-a214-e437d556f6a5', 32, NULL),
(17, 'f150dff2-4843-492e-8a6c-f3f7f9d3beac', 34, NULL),
(18, 'd44ab428-1f74-4334-9cd4-f3cbdfe4fcaf', 38, NULL),
(19, '4146f318-40c4-4ff6-95f8-7e43eeb370f4', 41, NULL),
(20, '5fc295b9-0604-4da5-bd72-4fb9ce771b72', 45, NULL),
(21, '72e5c2e2-10cf-4070-a7a2-a0503f41cc7a', 46, NULL),
(22, '52a10f22-8449-4a6c-9d78-f89bb4aca993', 49, NULL),
(23, '7348957d-0755-4b5a-a082-157f6527da65', 56, NULL),
(24, '915bbea6-bc15-47f0-b19a-4520cfc4c175', 57, NULL),
(25, '8bc8179f-6e35-4b67-a091-4204787700f2', 60, NULL),
(26, '97d5af05-766b-4c5d-bed8-27408020644b', 61, NULL),
(27, 'cd52dbce-7dec-4186-8492-383d011024c5', 62, NULL),
(28, 'ee4fa5b2-21ac-4196-b0f8-78d252343428', 63, NULL),
(29, 'f77a802f-aba0-498b-8fce-277681a303d2', 67, NULL),
(30, '54389c44-42c3-41bd-a622-74b447e5d506', 68, NULL),
(31, '2dbcd3bc-fd1f-4506-9bb6-853c825ab65e', 69, NULL),
(32, 'b23a4061-9672-4b10-a0ac-3f160191dc88', 74, NULL),
(33, '89e971c2-5a62-4347-8016-610d1b8a16d0', 78, NULL),
(34, '2cf075e7-b473-431e-bcaf-98cad6b581b2', 79, NULL),
(35, 'eadaca38-e94d-4177-89c0-fdb9e3243690', 80, NULL),
(36, '33e99406-5f26-4006-9892-a00b72f780f1', 85, NULL),
(37, '1fff4562-8fc2-4aa5-84c9-faf3ad949c8b', 87, NULL),
(38, '4777270f-1142-451d-a10c-3dbf94ffb79a', 88, NULL),
(39, '7f5a8130-f214-4b66-96d5-14641ce20898', 92, NULL),
(40, '0fc5e1c3-d6d5-4504-ba3c-fe719fe6c9f0', 94, NULL),
(41, '100af8cb-80e0-4421-9c40-eafa30a76de0', 95, NULL),
(42, 'ead6797c-e4c1-4839-97d3-ca460f0bd362', 96, NULL),
(43, '649f6945-8f9a-4526-acb5-38c4eca0212e', 97, NULL),
(44, 'b2ba1eec-98d1-44cd-9a37-ef85c3229592', 99, NULL),
(45, '14151d00-dd04-4a3c-b5c7-a6b6602229e6', 101, NULL),
(46, '67a488cd-5297-438c-a528-a5437238c29f', 103, NULL),
(47, 'df13513c-5d10-4628-9cd9-f34af24b5354', 110, NULL),
(48, 'df4b993a-7abe-4f5d-82fe-12e08b887c03', 114, NULL),
(49, '888ab8cd-ed3f-49c4-b059-a3a16d8c0b03', 116, NULL),
(50, 'e00dbf8e-681d-47e1-b9bd-91da0e7ab5f8', 117, NULL),
(51, 'b4156abf-4b43-4e07-a2f1-f073aef6e12c', 118, NULL),
(52, '4c956fc8-c5bb-4db8-b398-2b9557ebbfb4', 119, NULL),
(53, '4953b3f4-f072-40b4-a712-e8039c07692d', 120, NULL),
(54, 'b52bbe92-b4ba-4b20-934a-13bea8c34ad5', 124, NULL),
(55, 'c3ee0f1e-bd1e-4f50-b36d-2bfefdafb41e', 126, NULL),
(56, '9a782d65-2168-44d0-a1fa-542c8a06eb15', 128, NULL),
(57, '2aaa9237-befa-4dba-b318-f991df309d5d', 129, NULL),
(58, '018f2176-42cf-485b-8b8a-d62d1ec2c129', 131, NULL),
(59, 'd527e631-1215-44d1-8253-4e17bab6963c', 134, NULL),
(60, '71d64de0-413a-4d1f-8c33-9b0b81275313', 137, NULL),
(61, 'f3a71bcc-494c-4d58-a905-73934c62a895', 138, NULL),
(62, '0602d8f0-3e26-41fd-afde-129ee6183b55', 143, NULL),
(63, '073fa302-1d56-4978-b835-ab0ac1815761', 145, NULL),
(64, '6429e0bd-c7ff-468d-a97a-01da06183d32', 146, NULL),
(65, '537257ec-ea8b-4789-bb9c-789ff84f4afd', 147, NULL),
(66, '53e0e045-9045-4a42-8a07-f996babc5d76', 148, NULL),
(67, '62db8ed4-300e-4f24-a88b-fc3bc35bcf46', 150, NULL),
(68, 'fb32fd4d-0230-43b5-8fc0-6df01f93a6af', 153, NULL),
(69, '57f4b691-d7ca-47e0-8e09-97e06d71081a', 154, NULL),
(70, 'f2d49462-a2d1-4550-bec8-1d402f678243', 159, NULL),
(71, 'f66a0e2c-982e-443e-8263-92d3724e489b', 160, NULL),
(72, '444e5747-f0e9-4be9-8227-de4c831357b0', 161, NULL),
(73, '530d38a1-b70e-4d22-84f8-cf4caa892ec5', 162, NULL),
(74, 'eb063acc-a901-4dfa-9d99-0e93b0ce9e61', 163, NULL),
(75, 'b0e91e8e-33c1-4a33-912c-beb8377d3562', 165, NULL),
(76, '96909100-1f86-4a09-8255-d4aa67693cef', 166, NULL),
(77, 'dbb764bb-daff-4a97-9f59-9aa5efe7b509', 167, NULL),
(78, '7c100843-1d96-4b9b-95d0-aa9ea9904569', 169, NULL),
(79, '29f36db1-974b-4783-abc2-793ead5df51b', 171, NULL),
(80, '3bdd2f73-0029-4ea1-85cb-ec8b7c987a09', 172, NULL),
(81, '68c2931c-19ab-4c09-9a54-53171a388a96', 173, NULL),
(82, 'bae65e4a-a8fa-47fc-a4ac-702886ed8c85', 174, NULL),
(83, '505eeea4-9445-4d1c-9d9f-be685da50868', 178, NULL),
(84, 'c1681e59-9b68-4114-b940-ef9aad53969a', 179, NULL),
(85, '0ec091ea-67f6-4c6e-9ce1-54dbeb13f483', 180, NULL);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `examen`
--
ALTER TABLE `examen`
 ADD PRIMARY KEY (`id_examen`), ADD KEY `FK8shl0iafhuu9kcgj12hbn9tr6` (`consultation_id_consultation`), ADD KEY `FKfqat2tek1o8t4mohpwhkllsu8` (`type_examen_id_type_examen`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `examen`
--
ALTER TABLE `examen`
MODIFY `id_examen` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=86;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `examen`
--
ALTER TABLE `examen`
ADD CONSTRAINT `FK8shl0iafhuu9kcgj12hbn9tr6` FOREIGN KEY (`consultation_id_consultation`) REFERENCES `consultation` (`id_consultation`),
ADD CONSTRAINT `FKfqat2tek1o8t4mohpwhkllsu8` FOREIGN KEY (`type_examen_id_type_examen`) REFERENCES `type_examen` (`id_type_examen`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
