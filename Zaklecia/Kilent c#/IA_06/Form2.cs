
using IA_06.Spells;
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
        SpellManagerClient bm2 = new SpellManagerClient();
        public void someFunction(SpellManagerClient bm)
        {
            bm2 = bm;
        }
        private void Form2_Load(object sender, EventArgs e)
        {
            
        }

        private void buttonAdd_Click(object sender, EventArgs e)
        {
            Spell sp = new Spell();
            try
            {

                sp.id = textBoxId.Text;
                sp.index = Int32.Parse(textBoxIndex.Text);
                sp.name = textBoxName.Text;
                List<string> description = new List<string>();
                description.Add(textBoxDescription.Text);
                sp.desc = description.ToArray();
                List<string> higherLvl = new List<string>();
                description.Add(textBoxHigherlvl.Text);
                sp.higher_level = higherLvl.ToArray();
                sp.page = textBoxPage.Text;
                sp.range = textBoxRange.Text;
                List<string> components = new List<string>();
                description.Add(textBoxComponents.Text);
                sp.components = components.ToArray();
                sp.material = textBoxMaterial.Text;
                sp.ritual = textBoxRitual.Text;
                sp.duration = textBoxDuration.Text;
                sp.concentration = textBoxConcentration.Text;
                sp.casting_time = textBoxCastingTime.Text;
                sp.level = Int32.Parse(textBoxlevel.Text);

                school school = new school();

                school.name = textBoxSchool.Text;
                school.url = "http://" + school.name;

                sp.school = school;

                List<CharacterClass> charClasses = new List<CharacterClass>();
                CharacterClass charClass = new CharacterClass();
                charClass.name = textBoxClasses.Text;
                charClass.url = "http://" + charClass.name;
                charClasses.Add(charClass);
                sp.characterClasses = charClasses.ToArray();

                List<Subclass> subclasses = new List<Subclass>();
                Subclass subclass = new Subclass();
                subclass.name = textBoxClasses.Text;
                subclass.url = "http://" + subclass.name;
                subclasses.Add(subclass);

                sp.subclasses = subclasses.ToArray();
                sp.url = textBoxUrl.Text;

                bm2.add2(sp);
                this.Close();
            }
            catch (Exception)
            {
                MessageBox.Show("Wypełnij poprawnie wszystkie pola!");
            }
            
        }
    }
}
