<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER Table[8]"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" arrondiAuto="vrai" totalBoucles="5000000" nbDecimales="8" totalAffichages="1000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Table EST_DU_TYPE LISTE" code="1#LISTE#Table"/>
        <item algoitem="Add EST_DU_TYPE NOMBRE" code="1#NOMBRE#Add"/>
        <item algoitem="I EST_DU_TYPE NOMBRE" code="1#NOMBRE#I"/>
        <item algoitem="Rand EST_DU_TYPE NOMBRE" code="1#NOMBRE#Rand"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR I ALLANT_DE 0 A 9" code="12#I#0#9">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="Add PREND_LA_VALEUR random()" code="5#Add#random()#pasliste"/>
            <item algoitem="Table[I] PREND_LA_VALEUR Add" code="5#Table#Add#I"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER Table[8]" code="3#Table#1#8"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
