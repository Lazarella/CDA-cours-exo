<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="C PREND_LA_VALEUR B"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#A" algoitem="A EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#B" algoitem="B EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#C" algoitem="C EST_DU_TYPE CHAINE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#A#&quot;A&quot;#pasliste" algoitem="A PREND_LA_VALEUR &quot;A&quot;"/>
        <item code="5#B#&quot;B&quot;#pasliste" algoitem="B PREND_LA_VALEUR &quot;B&quot;"/>
        <item code="5#C#B#pasliste" algoitem="C PREND_LA_VALEUR B"/>
        <item code="5#B#A#pasliste" algoitem="B PREND_LA_VALEUR A"/>
        <item code="5#A#C#pasliste" algoitem="A PREND_LA_VALEUR C"/>
        <item code="4#Variable A : #0" algoitem="AFFICHER &quot;Variable A : &quot;"/>
        <item code="3#A#1#pasliste" algoitem="AFFICHER A"/>
        <item code="4#Variable B : #0" algoitem="AFFICHER &quot;Variable B : &quot;"/>
        <item code="3#B#0#pasliste" algoitem="AFFICHER B"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
