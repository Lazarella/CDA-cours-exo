<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; est : &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Entrer un nombre entier : #0" algoitem="AFFICHER &quot;Entrer un nombre entier : &quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="5#b#a*2#pasliste" algoitem="b PREND_LA_VALEUR a*2"/>
        <item code="4#\b Le double de #0" algoitem="AFFICHER &quot;\b Le double de &quot;"/>
        <item code="3#a#0#pasliste" algoitem="AFFICHER a"/>
        <item code="4# est : #0" algoitem="AFFICHER &quot; est : &quot;"/>
        <item code="3#b#0#pasliste" algoitem="AFFICHER b"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
