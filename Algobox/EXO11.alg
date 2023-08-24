<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot; années pour doubler votre capital.&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalAffichages="1000" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Rate EST_DU_TYPE NOMBRE" code="1#NOMBRE#Rate"/>
        <item algoitem="Nb_Years EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nb_Years"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Indiquez le taux proposé (%) &quot;" code="4#Indiquez le taux proposé (%) #0"/>
        <item algoitem="LIRE Rate" code="2#Rate#pasliste"/>
        <item algoitem="TANT_QUE (pow(1 + Rate / 100, Nb_Years) &lt; 2) FAIRE" code="15#pow(1 + Rate / 100, Nb_Years) &lt; 2">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="Nb_Years PREND_LA_VALEUR Nb_Years+1" code="5#Nb_Years#Nb_Years+1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER &quot;Il vous faudra &quot;" code="4#Il vous faudra #0"/>
        <item algoitem="AFFICHER Nb_Years" code="3#Nb_Years#0#pasliste"/>
        <item algoitem="AFFICHER &quot; années pour doubler votre capital.&quot;" code="4# années pour doubler votre capital.#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
