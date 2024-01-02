package main.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 전공 평점 = (SUM(학점X과목평점)) / SUM(학점)
public class Advanced_25206_average_grade
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double scoreSum = 0;
        double gradeSum = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
            double inputScore = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            double score = 0;

            if (!(grade.equals("P"))){
                switch (grade) {
                    case "A+" -> score = 4.5;
                    case "A0" -> score = 4.0;
                    case "B+" -> score = 3.5;
                    case "B0" -> score = 3.0;
                    case "C+" -> score = 2.5;
                    case "C0" -> score = 2.0;
                    case "D+" -> score = 1.5;
                    case "D0" -> score = 1.0;
                    case "F" -> score = 0.0;
                }
                scoreSum += (inputScore * score);
                gradeSum += inputScore;
            }


        }

        System.out.printf("%.6f", scoreSum/gradeSum);
        br.close();

    }
}
// 오답 이유: if 문 안에 gradeSum += inputScore; 가 들어왔었어야 했는데 if 문 바깥에 있어서,
// 전공과목이 P일 때의 과목평점도 합계가 되었음.
/*
Input 1
        ObjectOrientedProgramming1 3.0 A+
        IntroductiontoComputerEngineering 3.0 A+
        ObjectOrientedProgramming2 3.0 A0
        CreativeComputerEngineeringDesign 3.0 A+
        AssemblyLanguage 3.0 A+
        InternetProgramming 3.0 B0
        ApplicationProgramminginJava 3.0 A0
        SystemProgramming 3.0 B0
        OperatingSystem 3.0 B0
        WirelessCommunicationsandNetworking 3.0 C+
        LogicCircuits 3.0 B0
        DataStructure 4.0 A+
        MicroprocessorApplication 3.0 B+
        EmbeddedSoftware 3.0 C0
        ComputerSecurity 3.0 D+
        Database 3.0 C+
        Algorithm 3.0 B0
        CapstoneDesigninCSE 3.0 B+
        CompilerDesign 3.0 D0
        ProblemSolving 4.0 P

Output 1
        3.284483
*/
