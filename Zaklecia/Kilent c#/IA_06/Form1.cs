using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using IA_06.Spells;

namespace IA_06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }

        SpellManagerClient bm = new SpellManagerClient();
        private void buttonSearch_Click(object sender, EventArgs e)
        {
            
            
            string s = textBox1.Text;
            Spell[] spells = null;

            switch (comboBox1.SelectedIndex)
            {
                case 0:
                    if (s == null) break;
                    spells = bm.searchByName(s);
                    break;
                case 1:
                    if (s == null) break;
                    spells = bm.searchByClass(s);
                    break;
                case 2:
                    if (s == null) break;
                    spells = bm.searchByLevel(Int32.Parse(s));
                    break;
                

            }
            
            dataGridView1.DataSource = spells;
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();
            form2.Show();
            form2.someFunction(bm);
        }
    }
}
