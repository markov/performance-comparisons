package org.gradle.test.performance44_5

import org.junit.Assert.*

class Test44_405 {
    private val production = Production44_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
