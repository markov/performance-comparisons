package org.gradle.test.performance19_1

import org.junit.Assert.*

class Test19_54 {
    private val production = Production19_54("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}