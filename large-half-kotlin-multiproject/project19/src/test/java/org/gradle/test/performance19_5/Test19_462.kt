package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_462 {
    private val production = Production19_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}