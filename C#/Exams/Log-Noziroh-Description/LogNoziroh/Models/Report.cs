using System.ComponentModel.DataAnnotations;

namespace LogNoziroh.Models
{
    public class Report
    {
        //TODO: Implement me ...

        [Key]
        public int Id { get; set; }

        [Required]
        [MinLength(1)]
        public string Status { get; set; }

        [Required]
        [MinLength(1)]
        public string Message { get; set; }

        [Required]
        [MinLength(1)]
        public string Origin { get; set; }
    }
}