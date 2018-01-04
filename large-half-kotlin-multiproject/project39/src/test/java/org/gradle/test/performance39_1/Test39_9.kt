package org.gradle.test.performance39_1

import org.junit.Assert.*

class Test39_9 {
    private val production = Production39_9("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}