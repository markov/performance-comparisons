package org.gradle.test.performance39_3

import org.junit.Assert.*

class Test39_255 {
    private val production = Production39_255("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}