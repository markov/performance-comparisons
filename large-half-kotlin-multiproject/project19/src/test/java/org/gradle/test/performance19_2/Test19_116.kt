package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_116 {
    private val production = Production19_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}