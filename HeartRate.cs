using System;

namespace KattisProblem
{
    class Program
    {
        const int NUMBER = 60;

        static void Main(string[] args)
        {
            int numberRunning = Convert.ToInt16(Console.ReadLine());
            double ActualBeatsPerMinutes, MinimumABPM, MaxABPM;
            double NumberBeats;
            for (int i = 0; i < numberRunning; i++)
            {
                string[] x = Console.ReadLine().Split(' ');
                NumberBeats = Convert.ToDouble(x[x.Length - x.Length]);
                double NumberPerSecond = System.Convert.ToDouble((x[x.Length - 1]));
                ActualBeatsPerMinutes = (NUMBER * NumberBeats) / NumberPerSecond;
                MinimumABPM = Math.Round((ActualBeatsPerMinutes - (NUMBER / NumberPerSecond)), 4);
                MaxABPM = Math.Round((ActualBeatsPerMinutes + (NUMBER / NumberPerSecond)), 4);
                Console.WriteLine(MinimumABPM.ToString("0.0000")
                              + " "
                              + ActualBeatsPerMinutes.ToString("0.0000")
                              + " "
                              + MaxABPM.ToString("0.0000"));
            }

        }
    }
}