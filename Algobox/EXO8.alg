<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalAffichages="1000" epaisseurPoint="2" maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="AB EST_DU_TYPE NOMBRE" code="1#NOMBRE#AB"/>
        <item algoitem="AC EST_DU_TYPE NOMBRE" code="1#NOMBRE#AC"/>
        <item algoitem="BC EST_DU_TYPE NOMBRE" code="1#NOMBRE#BC"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Entrez un valeur(en cm) pour le segment AB&quot;" code="4#Entrez un valeur(en cm) pour le segment AB#0"/>
        <item algoitem="LIRE AB" code="2#AB#pasliste"/>
        <item algoitem="AFFICHER &quot;Entrez un valeur(en cm) pour le segment AC&quot;" code="4#Entrez un valeur(en cm) pour le segment AC#0"/>
        <item algoitem="LIRE AC" code="2#AC#pasliste"/>
        <item algoitem="AFFICHER &quot;Entrez un valeur(en cm) pour le segment BC&quot;" code="4#Entrez un valeur(en cm) pour le segment BC#0"/>
        <item algoitem="LIRE BC" code="2#BC#pasliste"/>
        <item algoitem="SI (AB == BC) ALORS" code="6#AB == BC">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="SI (BC == AC) ALORS" code="6#BC == AC">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Le triangle est equilatéral&quot;" code="4#Le triangle est equilatéral#1"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Le triangle est isocèle en B&quot;" code="4#Le triangle est isocèle en B#1"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (BC == AC) ALORS" code="6#BC == AC">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;Le triangle est isocèle en C&quot;" code="4#Le triangle est isocèle en C#1"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (AB == AC) ALORS" code="6#AB == AC">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;Le triangle est isocèle en A &quot;" code="4#Le triangle est isocèle en A #1"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="AFFICHER &quot;Le triangle est quelconque&quot;" code="4#Le triangle est quelconque#1"/>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
