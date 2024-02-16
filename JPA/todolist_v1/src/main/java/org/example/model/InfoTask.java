package org.example.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="info_task")
public class InfoTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_info_task")
    private Long id;

    @Column(nullable=false, length = 255)
    private String description;
    @Column(name="due_date", nullable= false)
    private Date dueDate;
    private Priority priority;

    @OneToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id_task")
    private Task task;

    public InfoTask() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "InfoTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                '}';
    }
}
