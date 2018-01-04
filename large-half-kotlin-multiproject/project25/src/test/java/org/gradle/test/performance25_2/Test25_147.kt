package org.gradle.test.performance25_2

import org.junit.Assert.*

class Test25_147 {
    private val production = Production25_147("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}