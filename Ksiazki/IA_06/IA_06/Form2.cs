using IA_06.ServiceReference1;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace IA_06
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
            
        }
        BookManagerClient bm2 = new BookManagerClient();
        public void someFunction(BookManagerClient bm)
        {
            bm2 = bm;
        }
        private void Form2_Load(object sender, EventArgs e)
        {
            
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            book bk = new book();
            try
            {
             
                bk.id = textBoxId.Text;
                bk.title = textBoxTitle.Text;
                bk.author = textBoxAuthor.Text;
                bk.isbn = textBoxISBN.Text;
                bk.year = int.Parse(textBoxYear.Text);
                bk.publisher = textBoxPublisher.Text;
                bk.pages = int.Parse(textBoxPages.Text);
            
                bm2.add(bk);
                this.Close();
            }
            catch (Exception)
            {
                MessageBox.Show("Wypełnij poprawnie wszystkie pola!");
            }
            
        }
    
    }
}
