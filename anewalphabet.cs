using System;
using System.Collections.Generic;

    public class ANewAlphabet
    {
        public static void Main()
        {
            Dictionary<char, string> dict = new Dictionary<char, string>();
            dict.Add('a', "@");
            dict.Add('b',"8");
            dict.Add('c', "(");
            dict.Add('d',"|)");
            dict.Add('e', "3");
            dict.Add('f', "#");
            dict.Add('g', "6");
            dict.Add('h', "[-]");
            dict.Add('i', "|");
            dict.Add('j', "_|");
            dict.Add('k', "|<");
            dict.Add('l', "1");
            dict.Add('m', @"[]\/[]");
            dict.Add('n', @"[]\[]");
            dict.Add('o', "0");
            dict.Add('p', "|D");
            dict.Add('q', "(,)");
            dict.Add('r', "|Z");
            dict.Add('s', "$");
            dict.Add('t', @"']['");
            dict.Add('u', "|_|");
            dict.Add('v', @"\/");
            dict.Add('w', @"\/\/");
            dict.Add('x', @"}{");
            dict.Add('y', @"`/");
            dict.Add('z', @"2");
            string result = Convert.ToString(Console.ReadLine());
            foreach(char l in result.ToLower())
            {
                if((l>=32 && l<=126) || l == 9)
                {
                    if (l >= 97 && l <= 122)
                        Console.Write(dict[l]);
                    else
                        Console.Write(l);
                }
            }
         }
    }

