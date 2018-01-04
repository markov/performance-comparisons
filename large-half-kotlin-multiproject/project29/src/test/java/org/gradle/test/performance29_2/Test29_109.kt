package org.gradle.test.performance29_2

import org.junit.Assert.*

class Test29_109 {
    private val production = Production29_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}