package org.gradle.test.performance48_1

import org.junit.Assert.*

class Test48_82 {
    private val production = Production48_82("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
