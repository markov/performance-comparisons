package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_109 {
    private val production = Production19_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}