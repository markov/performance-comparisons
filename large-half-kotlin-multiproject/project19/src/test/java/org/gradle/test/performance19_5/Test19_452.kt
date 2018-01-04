package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_452 {
    private val production = Production19_452("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}