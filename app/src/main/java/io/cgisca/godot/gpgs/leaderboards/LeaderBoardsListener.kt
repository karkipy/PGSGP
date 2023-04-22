package io.cgisca.godot.gpgs.leaderboards

interface LeaderBoardsListener {
    fun onLeaderBoardScoreSubmitted(leaderboardId: String)
    fun onLeaderBoardScoreSubmittingFailed(leaderboardId: String)
    fun onCurrentPlayerLeaderBoardScoreLoadingFailed(leaderboardId: String)
    fun onCurrentPlayerLeaderBoardScoreLoaded(leaderboardId: String, scoreJson: String)
}