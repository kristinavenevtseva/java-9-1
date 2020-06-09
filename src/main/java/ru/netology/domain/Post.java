package ru.netology.domain;

public class Post {

    private int id;
    private int fromId;
    private int date;
    private String text;
    private String attachmentsUrl;
    private ViewsInfo viewsInfo;
    private RepostsInfo repostsInfo;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private FavoritesInfo favoritesInfo;
    private String originalSiteUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttachmentsUrl() {
        return attachmentsUrl;
    }

    public void setAttachmentsUrl(String attachmentsUrl) {
        this.attachmentsUrl = attachmentsUrl;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public FavoritesInfo getFavoritesInfo() {
        return favoritesInfo;
    }

    public void setFavoritesInfo(FavoritesInfo favoritesInfo) {
        this.favoritesInfo = favoritesInfo;
    }

    public String getOriginalSiteUrl() {
        return originalSiteUrl;
    }

    public void setOriginalSiteUrl(String originalSiteUrl) {
        this.originalSiteUrl = originalSiteUrl;
    }
}