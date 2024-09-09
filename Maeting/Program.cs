// See https://aka.ms/new-console-template for more information
using System.ComponentModel.DataAnnotations;
using System.Text;
using System; 
using System.Collections.Generic;  


Console.WriteLine("Hello, World!");
string[] strings = Console.ReadLine().Split(' ');
int[] lengths = new int[2]; 
for (int i = 0; i < lengths.Length; i++)
{
    lengths[i] = int.Parse(strings[i]);
}

int[] first = Console.ReadLine().Split(' ').Select(x => int.Parse(x)).ToArray(); 
List<int> second = Console.ReadLine().Split(' ').Select(x => int.Parse(x)).ToList(); 

StringBuilder sb = new StringBuilder(); 

for (int i = 0; i < first.Length; i++)
{
    if (second.Contains(first[i])){
        sb.Append($"{first[i]} "); 
    }
}

string output = sb.ToString().Substring(0, sb.Length-1); 
Console.WriteLine(output);