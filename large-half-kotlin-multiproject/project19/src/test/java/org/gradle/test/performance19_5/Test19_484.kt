package org.gradle.test.performance19_5

import org.junit.Assert.*

class Test19_484 {
    private val production = Production19_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}