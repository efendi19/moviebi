package com.diekalin.movie.ui.movie

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.diekalin.movie.data.remote.MovieRepository
import javax.inject.Inject

class MovieViewModel @ViewModelInject constructor  (private val repository: MovieRepository) : ViewModel() {
}