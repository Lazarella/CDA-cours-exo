<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#I" algoitem="I EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#J" algoitem="J EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#I#1#10" algoitem="POUR I ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#==== Table de #0" algoitem="AFFICHER &quot;==== Table de &quot;"/>
            <item code="3#I#0#pasliste" algoitem="AFFICHER I"/>
            <item code="4# ====\n#1" algoitem="AFFICHER &quot; ====\n&quot;"/>
            <item code="12#J#1#10" algoitem="POUR J ALLANT_DE 1 A 10">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="3#I#0#pasliste" algoitem="AFFICHER I"/>
                <item code="4# x #0" algoitem="AFFICHER &quot; x &quot;"/>
                <item code="3#J#0#pasliste" algoitem="AFFICHER J"/>
                <item code="4# = #0" algoitem="AFFICHER &quot; = &quot;"/>
                <item code="20#I*J#1" algoitem="AFFICHERCALCUL I*J"/>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="4#\n#1" algoitem="AFFICHER &quot;\n&quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
