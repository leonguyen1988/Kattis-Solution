using System;
using System.Collections.Generic;

namespace Planina
{
    class Planina
    {
        static void Main(string[] args)
        {

            double interator = Convert.ToDouble(Console.ReadLine());
            double Beginning = 4;
            for(int i =0; i<interator;i++)
            {
                Beginning = Math.Pow((Math.Sqrt(Beginning) + Math.Pow(2, i)),2);
            }
            Console.WriteLine(Beginning);
            Console.ReadLine();
        }
    }
}