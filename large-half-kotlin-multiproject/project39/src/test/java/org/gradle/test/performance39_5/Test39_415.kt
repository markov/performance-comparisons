package org.gradle.test.performance39_5

import org.junit.Assert.*

class Test39_415 {
    private val production = Production39_415("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}