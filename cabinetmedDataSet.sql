-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 19 Novembre 2017 à 01:28
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
-- Structure de la table `certificat_medical`
--

CREATE TABLE IF NOT EXISTS `certificat_medical` (
`id_certificat_medical` bigint(20) NOT NULL,
  `date_debut` datetime DEFAULT NULL,
  `nombre_jour` int(11) NOT NULL,
  `observation` varchar(255) DEFAULT NULL,
  `consultation_id_consultation` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

CREATE TABLE IF NOT EXISTS `consultation` (
`id_consultation` bigint(20) NOT NULL,
  `date_consultation` datetime DEFAULT NULL,
  `duree` int(11) DEFAULT NULL,
  `docteur_id_personne` bigint(20) DEFAULT NULL,
  `dossier_medical_id_dossier_medical` bigint(20) DEFAULT NULL,
  `examen_id_examen` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `consultation_symptome`
--

CREATE TABLE IF NOT EXISTS `consultation_symptome` (
  `id_consultation` bigint(20) NOT NULL,
  `id_symptome` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `docteur`
--

CREATE TABLE IF NOT EXISTS `docteur` (
  `id_personne` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `docteur_consultations`
--

CREATE TABLE IF NOT EXISTS `docteur_consultations` (
  `docteur_id_personne` bigint(20) NOT NULL,
  `consultations_id_consultation` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `dossier_medical`
--

CREATE TABLE IF NOT EXISTS `dossier_medical` (
`id_dossier_medical` bigint(20) NOT NULL,
  `date_creation` datetime DEFAULT NULL,
  `patient_id_personne` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `etat`
--

CREATE TABLE IF NOT EXISTS `etat` (
`id_etat` bigint(20) NOT NULL,
  `poids` double DEFAULT NULL,
  `temperature` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE IF NOT EXISTS `examen` (
`id_examen` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `consultation_id_consultation` bigint(20) DEFAULT NULL,
  `type_examen_id_type_examen` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequences`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `sequence_next_hi_value` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maladie`
--

CREATE TABLE IF NOT EXISTS `maladie` (
  `id_maladie` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `libele` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maladie_herite`
--

CREATE TABLE IF NOT EXISTS `maladie_herite` (
  `id_maladie` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `libele` varchar(255) DEFAULT NULL,
  `source_maladie` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maladie_herite_patient`
--

CREATE TABLE IF NOT EXISTS `maladie_herite_patient` (
  `idmaladieherite` bigint(20) NOT NULL,
  `idpatient` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maladie_patient`
--

CREATE TABLE IF NOT EXISTS `maladie_patient` (
  `idmaladie` bigint(20) NOT NULL,
  `idpatient` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `maladie_symptome`
--

CREATE TABLE IF NOT EXISTS `maladie_symptome` (
  `idmaladie` bigint(20) NOT NULL,
  `idsymptome` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE IF NOT EXISTS `medicament` (
`id_medicament` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `medicament_prescriptions`
--

CREATE TABLE IF NOT EXISTS `medicament_prescriptions` (
  `medicament_id_medicament` bigint(20) NOT NULL,
  `prescriptions_id_prescription` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `ordonnance`
--

CREATE TABLE IF NOT EXISTS `ordonnance` (
`id_ordonnance` bigint(20) NOT NULL,
  `date_ordonnace` datetime DEFAULT NULL,
  `consultation_id_consultation` bigint(20) DEFAULT NULL,
  `patient_id_personne` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `ordonnance_prescriptions`
--

CREATE TABLE IF NOT EXISTS `ordonnance_prescriptions` (
  `ordonnance_id_ordonnance` bigint(20) NOT NULL,
  `prescriptions_id_prescription` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE IF NOT EXISTS `patient` (
  `id_personne` bigint(20) NOT NULL,
  `ref_sex_id_sexe` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE IF NOT EXISTS `personne` (
  `id_personne` bigint(20) NOT NULL,
  `cin` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` longtext,
  `telephone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `prescription`
--

CREATE TABLE IF NOT EXISTS `prescription` (
`id_prescription` bigint(20) NOT NULL,
  `combien` int(11) DEFAULT NULL,
  `description` longtext,
  `nbre_fois` int(11) DEFAULT NULL,
  `quand` datetime DEFAULT NULL,
  `medicament_id_medicament` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `ref_sex`
--

CREATE TABLE IF NOT EXISTS `ref_sex` (
`id_sexe` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `secretaire`
--

CREATE TABLE IF NOT EXISTS `secretaire` (
  `id_personne` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `symptome`
--

CREATE TABLE IF NOT EXISTS `symptome` (
`id_symptome` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `libele` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `type_examen`
--

CREATE TABLE IF NOT EXISTS `type_examen` (
`id_type_examen` bigint(20) NOT NULL,
  `lebel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `type_examen_examen`
--

CREATE TABLE IF NOT EXISTS `type_examen_examen` (
  `type_examen_id_type_examen` bigint(20) NOT NULL,
  `examen_id_examen` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `certificat_medical`
--
ALTER TABLE `certificat_medical`
 ADD PRIMARY KEY (`id_certificat_medical`), ADD KEY `FKfjhayg6n4j294banbldsg8w5a` (`consultation_id_consultation`);

--
-- Index pour la table `consultation`
--
ALTER TABLE `consultation`
 ADD PRIMARY KEY (`id_consultation`), ADD KEY `FKs7fsur1qssfls9rm137s8kwq7` (`docteur_id_personne`), ADD KEY `FKs3kv1t69106ykpwyopemn3g7p` (`dossier_medical_id_dossier_medical`), ADD KEY `FKgkbobnmtx7iwm2q8q3cjvocgx` (`examen_id_examen`);

--
-- Index pour la table `consultation_symptome`
--
ALTER TABLE `consultation_symptome`
 ADD KEY `FK5atib0ajyp2517ny4dc67pn4f` (`id_symptome`), ADD KEY `FKkvns9exovf6dk4q2h135d5kr1` (`id_consultation`);

--
-- Index pour la table `docteur`
--
ALTER TABLE `docteur`
 ADD PRIMARY KEY (`id_personne`);

--
-- Index pour la table `docteur_consultations`
--
ALTER TABLE `docteur_consultations`
 ADD UNIQUE KEY `UK_boksh2yduow7d7va3y55xacf4` (`consultations_id_consultation`), ADD KEY `FKi9p5v8hb2ofhbfrtmmi011f3t` (`docteur_id_personne`);

--
-- Index pour la table `dossier_medical`
--
ALTER TABLE `dossier_medical`
 ADD PRIMARY KEY (`id_dossier_medical`), ADD KEY `FKe27u0hp67q83t739gdmc15eer` (`patient_id_personne`);

--
-- Index pour la table `etat`
--
ALTER TABLE `etat`
 ADD PRIMARY KEY (`id_etat`);

--
-- Index pour la table `examen`
--
ALTER TABLE `examen`
 ADD PRIMARY KEY (`id_examen`), ADD KEY `FK8shl0iafhuu9kcgj12hbn9tr6` (`consultation_id_consultation`), ADD KEY `FKfqat2tek1o8t4mohpwhkllsu8` (`type_examen_id_type_examen`);

--
-- Index pour la table `hibernate_sequences`
--
ALTER TABLE `hibernate_sequences`
 ADD PRIMARY KEY (`sequence_name`);

--
-- Index pour la table `maladie`
--
ALTER TABLE `maladie`
 ADD PRIMARY KEY (`id_maladie`);

--
-- Index pour la table `maladie_herite`
--
ALTER TABLE `maladie_herite`
 ADD PRIMARY KEY (`id_maladie`);

--
-- Index pour la table `maladie_herite_patient`
--
ALTER TABLE `maladie_herite_patient`
 ADD KEY `FKlhqk32sgwh7ttnnhmmc10pq16` (`idpatient`), ADD KEY `FKja6vk7naqoklpe84hrn32iqfb` (`idmaladieherite`);

--
-- Index pour la table `maladie_patient`
--
ALTER TABLE `maladie_patient`
 ADD KEY `FKqm39hv6pai8o8svx4lvl12u2a` (`idpatient`);

--
-- Index pour la table `maladie_symptome`
--
ALTER TABLE `maladie_symptome`
 ADD KEY `FKf9im2qnhm1b0dt4t2dm7cjqb8` (`idsymptome`);

--
-- Index pour la table `medicament`
--
ALTER TABLE `medicament`
 ADD PRIMARY KEY (`id_medicament`);

--
-- Index pour la table `medicament_prescriptions`
--
ALTER TABLE `medicament_prescriptions`
 ADD UNIQUE KEY `UK_rcki4k6syk50cimmc3883hc6t` (`prescriptions_id_prescription`), ADD KEY `FK87efn1yl8mw4fsldi5eyid8b0` (`medicament_id_medicament`);

--
-- Index pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
 ADD PRIMARY KEY (`id_ordonnance`), ADD KEY `FK7d72gnypddtcnu2b0gc52fot2` (`consultation_id_consultation`), ADD KEY `FK750skunqt5w0h8v32e7uh9k7s` (`patient_id_personne`);

--
-- Index pour la table `ordonnance_prescriptions`
--
ALTER TABLE `ordonnance_prescriptions`
 ADD UNIQUE KEY `UK_84xbkqx755ymujk91ic9va89b` (`prescriptions_id_prescription`), ADD KEY `FKo9lakyb0lwqkdaiqawh5ehe7o` (`ordonnance_id_ordonnance`);

--
-- Index pour la table `patient`
--
ALTER TABLE `patient`
 ADD PRIMARY KEY (`id_personne`), ADD KEY `FKsxjbm5nkryvuo99lmmgysiqdo` (`ref_sex_id_sexe`);

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
 ADD PRIMARY KEY (`id_personne`);

--
-- Index pour la table `prescription`
--
ALTER TABLE `prescription`
 ADD PRIMARY KEY (`id_prescription`), ADD KEY `FKplybjlwv1rmgjrv6rcku1a9pq` (`medicament_id_medicament`);

--
-- Index pour la table `ref_sex`
--
ALTER TABLE `ref_sex`
 ADD PRIMARY KEY (`id_sexe`);

--
-- Index pour la table `secretaire`
--
ALTER TABLE `secretaire`
 ADD PRIMARY KEY (`id_personne`);

--
-- Index pour la table `symptome`
--
ALTER TABLE `symptome`
 ADD PRIMARY KEY (`id_symptome`);

--
-- Index pour la table `type_examen`
--
ALTER TABLE `type_examen`
 ADD PRIMARY KEY (`id_type_examen`);

--
-- Index pour la table `type_examen_examen`
--
ALTER TABLE `type_examen_examen`
 ADD UNIQUE KEY `UK_igs9jrgnh0f1k0relxenayyxq` (`examen_id_examen`), ADD KEY `FK1b0be1sym2vgq73l3yipuu2ce` (`type_examen_id_type_examen`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `certificat_medical`
--
ALTER TABLE `certificat_medical`
MODIFY `id_certificat_medical` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `consultation`
--
ALTER TABLE `consultation`
MODIFY `id_consultation` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `dossier_medical`
--
ALTER TABLE `dossier_medical`
MODIFY `id_dossier_medical` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `etat`
--
ALTER TABLE `etat`
MODIFY `id_etat` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `examen`
--
ALTER TABLE `examen`
MODIFY `id_examen` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `medicament`
--
ALTER TABLE `medicament`
MODIFY `id_medicament` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
MODIFY `id_ordonnance` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `prescription`
--
ALTER TABLE `prescription`
MODIFY `id_prescription` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `ref_sex`
--
ALTER TABLE `ref_sex`
MODIFY `id_sexe` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `symptome`
--
ALTER TABLE `symptome`
MODIFY `id_symptome` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `type_examen`
--
ALTER TABLE `type_examen`
MODIFY `id_type_examen` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `certificat_medical`
--
ALTER TABLE `certificat_medical`
ADD CONSTRAINT `FKfjhayg6n4j294banbldsg8w5a` FOREIGN KEY (`consultation_id_consultation`) REFERENCES `consultation` (`id_consultation`);

--
-- Contraintes pour la table `consultation`
--
ALTER TABLE `consultation`
ADD CONSTRAINT `FKgkbobnmtx7iwm2q8q3cjvocgx` FOREIGN KEY (`examen_id_examen`) REFERENCES `examen` (`id_examen`),
ADD CONSTRAINT `FKs3kv1t69106ykpwyopemn3g7p` FOREIGN KEY (`dossier_medical_id_dossier_medical`) REFERENCES `dossier_medical` (`id_dossier_medical`),
ADD CONSTRAINT `FKs7fsur1qssfls9rm137s8kwq7` FOREIGN KEY (`docteur_id_personne`) REFERENCES `docteur` (`id_personne`);

--
-- Contraintes pour la table `consultation_symptome`
--
ALTER TABLE `consultation_symptome`
ADD CONSTRAINT `FK5atib0ajyp2517ny4dc67pn4f` FOREIGN KEY (`id_symptome`) REFERENCES `symptome` (`id_symptome`),
ADD CONSTRAINT `FKkvns9exovf6dk4q2h135d5kr1` FOREIGN KEY (`id_consultation`) REFERENCES `consultation` (`id_consultation`);

--
-- Contraintes pour la table `docteur`
--
ALTER TABLE `docteur`
ADD CONSTRAINT `FKkobbkal4xme6p4u6pwvej3v71` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`);

--
-- Contraintes pour la table `docteur_consultations`
--
ALTER TABLE `docteur_consultations`
ADD CONSTRAINT `FKi9p5v8hb2ofhbfrtmmi011f3t` FOREIGN KEY (`docteur_id_personne`) REFERENCES `docteur` (`id_personne`),
ADD CONSTRAINT `FKlp6psqgsgp1rd5kiyo6s35y4c` FOREIGN KEY (`consultations_id_consultation`) REFERENCES `consultation` (`id_consultation`);

--
-- Contraintes pour la table `dossier_medical`
--
ALTER TABLE `dossier_medical`
ADD CONSTRAINT `FKe27u0hp67q83t739gdmc15eer` FOREIGN KEY (`patient_id_personne`) REFERENCES `patient` (`id_personne`);

--
-- Contraintes pour la table `examen`
--
ALTER TABLE `examen`
ADD CONSTRAINT `FK8shl0iafhuu9kcgj12hbn9tr6` FOREIGN KEY (`consultation_id_consultation`) REFERENCES `consultation` (`id_consultation`),
ADD CONSTRAINT `FKfqat2tek1o8t4mohpwhkllsu8` FOREIGN KEY (`type_examen_id_type_examen`) REFERENCES `type_examen` (`id_type_examen`);

--
-- Contraintes pour la table `maladie_patient`
--
ALTER TABLE `maladie_patient`
ADD CONSTRAINT `FKqm39hv6pai8o8svx4lvl12u2a` FOREIGN KEY (`idpatient`) REFERENCES `patient` (`id_personne`);

--
-- Contraintes pour la table `maladie_symptome`
--
ALTER TABLE `maladie_symptome`
ADD CONSTRAINT `FKf9im2qnhm1b0dt4t2dm7cjqb8` FOREIGN KEY (`idsymptome`) REFERENCES `symptome` (`id_symptome`);

--
-- Contraintes pour la table `medicament_prescriptions`
--
ALTER TABLE `medicament_prescriptions`
ADD CONSTRAINT `FK87efn1yl8mw4fsldi5eyid8b0` FOREIGN KEY (`medicament_id_medicament`) REFERENCES `medicament` (`id_medicament`),
ADD CONSTRAINT `FKay4on58mk34kt562sa77wp74f` FOREIGN KEY (`prescriptions_id_prescription`) REFERENCES `prescription` (`id_prescription`);

--
-- Contraintes pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
ADD CONSTRAINT `FK750skunqt5w0h8v32e7uh9k7s` FOREIGN KEY (`patient_id_personne`) REFERENCES `patient` (`id_personne`),
ADD CONSTRAINT `FK7d72gnypddtcnu2b0gc52fot2` FOREIGN KEY (`consultation_id_consultation`) REFERENCES `consultation` (`id_consultation`);

--
-- Contraintes pour la table `ordonnance_prescriptions`
--
ALTER TABLE `ordonnance_prescriptions`
ADD CONSTRAINT `FKo9lakyb0lwqkdaiqawh5ehe7o` FOREIGN KEY (`ordonnance_id_ordonnance`) REFERENCES `ordonnance` (`id_ordonnance`),
ADD CONSTRAINT `FKtauddrnf3m7khw27wk3mw8wy2` FOREIGN KEY (`prescriptions_id_prescription`) REFERENCES `prescription` (`id_prescription`);

--
-- Contraintes pour la table `patient`
--
ALTER TABLE `patient`
ADD CONSTRAINT `FKrjid09o84upv5kdr04t3jxwmu` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`),
ADD CONSTRAINT `FKsxjbm5nkryvuo99lmmgysiqdo` FOREIGN KEY (`ref_sex_id_sexe`) REFERENCES `ref_sex` (`id_sexe`);

--
-- Contraintes pour la table `prescription`
--
ALTER TABLE `prescription`
ADD CONSTRAINT `FKplybjlwv1rmgjrv6rcku1a9pq` FOREIGN KEY (`medicament_id_medicament`) REFERENCES `medicament` (`id_medicament`);

--
-- Contraintes pour la table `secretaire`
--
ALTER TABLE `secretaire`
ADD CONSTRAINT `FK6c4du8ncop1s60f8oel2lud2` FOREIGN KEY (`id_personne`) REFERENCES `personne` (`id_personne`);

--
-- Contraintes pour la table `type_examen_examen`
--
ALTER TABLE `type_examen_examen`
ADD CONSTRAINT `FK1b0be1sym2vgq73l3yipuu2ce` FOREIGN KEY (`type_examen_id_type_examen`) REFERENCES `type_examen` (`id_type_examen`),
ADD CONSTRAINT `FK4t6us433yh20sk73qulusuule` FOREIGN KEY (`examen_id_examen`) REFERENCES `examen` (`id_examen`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
