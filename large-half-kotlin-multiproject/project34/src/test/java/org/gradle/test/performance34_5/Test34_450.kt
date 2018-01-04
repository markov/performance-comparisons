package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_450 {
    private val production = Production34_450("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}