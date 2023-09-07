<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHERCALCUL FizzBuzz(User_Entry)"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2" maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION FizzBuzz(A)" code="201#FizzBuzz#A">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction">
                <item algoitem="A EST_DU_TYPE NOMBRE" code="1#NOMBRE#A"/>
                <item algoitem="Fizz EST_DU_TYPE NOMBRE" code="1#NOMBRE#Fizz"/>
                <item algoitem="Buzz EST_DU_TYPE NOMBRE" code="1#NOMBRE#Buzz"/>
            </item>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="TANT_QUE (A=!e) FAIRE" code="15#A=!e">
                <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
                <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
            </item>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="User_Entry EST_DU_TYPE NOMBRE" code="1#NOMBRE#User_Entry"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;\t（づ￣3￣）づ╭❤～ Fizz Buzz ヾ(￣▽￣) e~ \n\n&quot;" code="4#\t（づ￣3￣）づ╭❤～ Fizz Buzz ヾ(￣▽￣) e~ \n\n#0"/>
        <item algoitem="AFFICHER &quot; f => Fizz (multiple de 3)&quot;" code="4# f => Fizz (multiple de 3)#1"/>
        <item algoitem="AFFICHER &quot; b => Buzz (multiple de 5)&quot;" code="4# b => Buzz (multiple de 5)#1"/>
        <item algoitem="AFFICHER &quot; h => Pour tout les autres nombres&quot;" code="4# h => Pour tout les autres nombres#1"/>
        <item algoitem="AFFICHER &quot; e => Pour quitter le jeu&quot;" code="4# e => Pour quitter le jeu#1"/>
        <item algoitem="AFFICHERCALCUL FizzBuzz(User_Entry)" code="20#FizzBuzz(User_Entry)#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
