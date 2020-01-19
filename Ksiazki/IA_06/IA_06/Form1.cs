using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using IA_06.ServiceReference1;

namespace IA_06
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            
        }

        BookManagerClient bm = new BookManagerClient();
        private void buttonSearch_Click(object sender, EventArgs e)
        {
            
            
            string s = textBox1.Text;
            book[] books = null;

            switch (comboBox1.SelectedIndex)
            {
                case 0:
                    books = bm.searchByTitle(s);
                    break;
                case 1:
                    books = bm.searchByAuthor(s);
                    break;
                case 2:
                    if (bm.searchByISBN(s) != null)
                        books = new book[]{bm.searchByISBN(s)};
                    break;

            }
            
            dataGridView1.DataSource = books;
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();
            form2.Show();
            form2.someFunction(bm);
        }
    }
}
