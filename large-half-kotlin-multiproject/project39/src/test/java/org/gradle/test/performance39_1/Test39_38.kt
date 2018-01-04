package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_38 {
    private val production = Production39_38("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}