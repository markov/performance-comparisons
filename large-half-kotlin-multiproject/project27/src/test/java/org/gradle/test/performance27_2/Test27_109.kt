package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_109 {
    private val production = Production27_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}