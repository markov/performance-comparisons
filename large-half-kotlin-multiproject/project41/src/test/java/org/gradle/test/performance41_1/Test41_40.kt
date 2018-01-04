package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_40 {
    private val production = Production41_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
