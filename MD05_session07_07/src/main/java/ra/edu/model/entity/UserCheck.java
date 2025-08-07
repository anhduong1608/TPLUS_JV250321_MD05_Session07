package ra.edu.model.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import ra.edu.model.entity.validate.ValidEmail;
import ra.edu.model.entity.validate.ValidNumber;


public class UserCheck {
    @NotBlank(message = "name not null")
    private String name;

    @NotNull
    @NotBlank(message = "email not null")
    private String email;

    @Min(value = 1, message = "min = 1")
    @Max(value = 5, message = "max = 5")
    @NotBlank(message = "rate not null")
    private String rate;

    @NotBlank
    @Length(max = 200, message = "max = 200")
    public String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
