package teamtreehouse.com.youtube_learning_buddy;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "YoutubeVideo")
public class YoutubeVideo {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "url")
    String url;
    @ColumnInfo(name = "title")
    String title;
    @ColumnInfo(name = "description")
    String description;
    @ColumnInfo(name = "categoryFk")
    String categoryFk;

    public YoutubeVideo(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryFk() {
        return categoryFk;
    }

    public void setCategoryFk(String categoryFk) {
        this.categoryFk = categoryFk;
    }
}
