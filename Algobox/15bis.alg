<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_POUR"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2defaut="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="I EST_DU_TYPE NOMBRE" code="1#NOMBRE#I"/>
        <item algoitem="J EST_DU_TYPE NOMBRE" code="1#NOMBRE#J"/>
        <item algoitem="Dispaly EST_DU_TYPE CHAINE" code="1#CHAINE#Dispaly"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n&quot;" code="4#\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n#0"/>
        <item algoitem="POUR I ALLANT_DE 1 A 10" code="12#I#1#10">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER &quot;\t&quot;" code="4#\t#0"/>
            <item algoitem="POUR J ALLANT_DE 1 A 10" code="12#J#1#10">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="AFFICHERCALCUL I*J" code="20#I*J#0"/>
                <item algoitem="AFFICHER &quot;\t&quot;" code="4#\t#0"/>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="AFFICHER &quot;\n&quot;" code="4#\n#0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
