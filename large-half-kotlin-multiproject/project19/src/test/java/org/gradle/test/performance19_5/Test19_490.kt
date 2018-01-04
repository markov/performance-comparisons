package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_490 {
    private val production = Production19_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}