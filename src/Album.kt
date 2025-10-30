class Album(val songs: List<Song>): Music {

    fun getSongsByArtists(artist: String) : List<Song> {
     //  return songs.filter { song -> song.artist == artist }
        return songs.filter { it.artist == artist }
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }

    override fun getPlayingTime(): Double {
        var runningTime = 0.0
        songs.forEach { runningTime += it.playingTime }
        return runningTime
    }

}