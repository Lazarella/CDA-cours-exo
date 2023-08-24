<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER T[8]"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai" epaisseurLigne="2" maxBoucle="500000" totalBoucles="5000000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="T EST_DU_TYPE LISTE" code="1#LISTE#T"/>
        <item algoitem="I EST_DU_TYPE NOMBRE" code="1#NOMBRE#I"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR I ALLANT_DE 0 A 9" code="12#I#0#9">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="T[I] PREND_LA_VALEUR floor(random() * 10) +1" code="5#T#floor(random() * 10) +1#I"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Valeurs : [&quot;" code="4#Valeurs : [#0"/>
        <item algoitem="POUR I ALLANT_DE 0 A 8" code="12#I#0#8">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER T[I]" code="3#T#0#I"/>
            <item algoitem="AFFICHER &quot;, &quot;" code="4#, #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER T[9]" code="3#T#0#9"/>
        <item algoitem="AFFICHER &quot;]&quot;" code="4#]#1"/>
        <item algoitem="AFFICHER &quot;La 9ème valeur est : &quot;" code="4#La 9ème valeur est : #0"/>
        <item algoitem="AFFICHER T[8]" code="3#T#1#8"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
