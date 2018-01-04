package org.gradle.test.performance19_3

import org.junit.Assert.*

class Test19_225 {
    private val production = Production19_225("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}